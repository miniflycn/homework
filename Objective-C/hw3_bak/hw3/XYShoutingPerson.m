//
//  XYShoutingPerson.m
//  test
//
//  Created by 杨 文坚 on 15/4/18.
//  Copyright (c) 2015年 miniflycn. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "XYShoutingPerson.h"

@implementation XYShoutingPerson
- (void) saySomething: (NSString *) greeting {
    NSString *uppercaseGreeting = [greeting uppercaseString];
    [super saySomething:uppercaseGreeting];
}
@end



