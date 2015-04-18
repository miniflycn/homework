//
//  XYPerson.h
//  test
//
//  Created by 杨 文坚 on 15/4/18.
//  Copyright (c) 2015年 miniflycn. All rights reserved.
//

#ifndef test_XYPerson_h
#define test_XYPerson_h

@interface XYPerson : NSObject
@property (readonly) NSString *firstName;
@property (readonly) NSString *lastName;
@property (readonly) NSString *fullName;
@property (readonly) NSDate *birthday;
- (id) initWithFirstName: (NSString *) aFirstName lastName: (NSString *) aLastName dateOfBirth: (NSDate *) aDOB;
- (id) initWithFirstName: (NSString *) aFirstName lastName: (NSString *) aLastName;
- (void) sayHello;
- (void) saySomething: (NSString *) greeting;
+ (id) person: (NSString *) aFirstName lastName: (NSString *) aLastName dateOfBirth: (NSDate *) aDOB;
+ (id) person;
@end

#endif
