//
//  XYPerson.h
//  test
//
//  Created by 杨 文坚 on 15/4/18.
//  Copyright (c) 2015年 杨 文坚. All rights reserved.
//

#ifndef test_XYPerson_h
#define test_XYPerson_h

@interface XYPerson : NSObject
@property (readonly) NSString *firstName;
@property (readonly) NSString *lastName;
@property (readonly) NSDate *birthday;
- (void) sayHello;
- (void) saySomething: (NSString *) greeting;
+ (id) person;
@end

#endif
