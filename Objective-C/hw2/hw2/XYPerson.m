//
//  XYPerson.m
//  test
//
//  Created by 杨 文坚 on 15/4/18.
//  Copyright (c) 2015年 miniflycn. All rights reserved.
//

#import <Foundation/Foundation.h>

#import "XYPerson.h"

@implementation XYPerson
@synthesize firstName = _firstName;
@synthesize lastName = _lastName;
@synthesize birthday = _birthday;
- (NSString *) fullName {
    return [NSString stringWithFormat: @"%@ %@", self.firstName, self.lastName];
}
- (id) init {
    return [self initWithFirstName: @"John" lastName: @"Doe" dateOfBirth: nil];
}
- (id) initWithFirstName: aFirstName lastName: (NSString *) aLastName dateOfBirth: (NSDate *) aDOB {
    self = [super init];
    
    if (self) {
        _firstName = aFirstName;
        _lastName = aLastName;
        _birthday = aDOB;
    }
    
    return self;
}
- (id) initWithFirstName: (NSString *) aFirstName lastName: (NSString *) aLastName {
    return [self initWithFirstName: aFirstName lastName: aLastName dateOfBirth: nil];
}
- (void) sayHello {
    [self saySomething: @"Hello, World!"];
}
- (void) saySomething: (NSString *) greeting {
    NSDateFormatter *formatter = [NSDateFormatter new];
    [formatter setDateStyle: NSDateFormatterFullStyle];
    NSLog(@"%@(%@) say: %@", self.fullName, self.birthday ? [formatter stringFromDate: self.birthday] : @"未知", greeting);
}
- (void) dealloc {
    NSLog(@"XYPerson %@ is being deallocated", self.fullName);
}
+ (id) person: (NSString *) aFirstName lastName: (NSString *) aLastName dateOfBirth: (NSDate *) aDOB {
    return [[self alloc] initWithFirstName: aFirstName lastName: aLastName dateOfBirth: aDOB];
}
+ (id) person {
    return [[self alloc] init];
}
@end
