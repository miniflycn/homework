//
//  XYPerson.m
//  test
//
//  Created by 杨 文坚 on 15/4/18.
//  Copyright (c) 2015年 杨 文坚. All rights reserved.
//

#import <Foundation/Foundation.h>

#import "XYPerson.h"

@implementation XYPerson
- (void) sayHello {
    [self saySomething: @"Hello, World!"];
}
- (void) saySomething: (NSString *) greeting {
    NSLog(@"%@", greeting);
}
+ (id) person {
    return [[self alloc] init];
}
@end
