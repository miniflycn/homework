//
//  main.m
//  hw3
//
//  Created by 杨 文坚 on 15/4/19.
//  Copyright (c) 2015年 miniflycn. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "XYPerson.h"
#import "XYPerson+XYPersonNameDisplayAdditions.h"
#import "XYShoutingPerson.h"

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        XYPerson *personA = [[XYPerson alloc] initWithFirstName: @"John" lastName: @"Doe"];
        XYShoutingPerson *personB = [[XYShoutingPerson alloc] initWithFirstName: @"Monica" lastName: @"Robinson"];
        personA.height = [NSNumber numberWithInteger: 180];
        personA.weight = [NSNumber numberWithInteger: 150];
        personB.height = [NSNumber numberWithInteger: 160];
        personB.weight = [NSNumber numberWithInteger: 100];
        NSLog(@"The two people are %@ and %@", [personA lastNameFirstNameString], [personB lastNameFirstNameString]);
        NSLog(@"%@ height is %@ cm, weigth is %@ 斤", personA.fullName, personA.height, personA.weight);
    }
    return 0;
}
