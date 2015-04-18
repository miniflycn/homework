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
        XYShoutingPerson *personB = [XYShoutingPerson person: @"Donald" lastName: @"Yang" dateOfBirth: [NSDate date]];
        [personB sayHello];
        XYPerson *personC;
        if (personC == nil) {
            NSLog(@"person C is not exist.");
        }
    }
    return 0;
}