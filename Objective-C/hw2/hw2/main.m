//
//  main.m
//  hw2
//
//  Created by 杨 文坚 on 15/4/19.
//  Copyright (c) 2015年 miniflycn. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "XYPerson.h"
#import "XYShoutingPerson.h"

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        XYPerson *personA = [[XYPerson alloc] init];
        [personA sayHello];
        NSMutableString *firstName = [NSMutableString stringWithString: @"Donald"];
        XYShoutingPerson *personB = [XYShoutingPerson person: firstName lastName: @"Yang" dateOfBirth: [NSDate date]];
        [firstName appendString: @"(Tencent)"];
        [personB sayHello];
        XYPerson *personC;
        if (personC == nil) {
            NSLog(@"person C is not exist.");
        }
    }
    return 0;
}