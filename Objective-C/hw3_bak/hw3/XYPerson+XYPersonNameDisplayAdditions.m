//
//  XYPerson+XYPersonNameDisplayAdditions.m
//  hw3
//
//  Created by 杨 文坚 on 15/4/19.
//  Copyright (c) 2015年 miniflycn. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "XYPerson+XYPersonNameDisplayAdditions.h"

@implementation XYPerson (XYPersonNameDisplayAdditions)
- (NSString *) lastNameFirstNameString {
    return [NSString stringWithFormat: @"%@, %@", self.lastName, self.firstName];
}
@end