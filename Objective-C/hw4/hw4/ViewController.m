//
//  ViewController.m
//  hw4
//
//  Created by 杨 文坚 on 15/4/19.
//  Copyright (c) 2015年 miniflycn. All rights reserved.
//

#import "ViewController.h"

@interface ViewController ()

@end

@implementation ViewController

- (void) loadView {
    [super loadView];
    
    UIView *view = [[UIView alloc] initWithFrame: [UIScreen mainScreen].applicationFrame];
    view.alpha = 0.5;
    view.backgroundColor = [UIColor cyanColor];
    self.view = view;
    
    UILabel *lab = [[UILabel alloc] initWithFrame: CGRectMake(100, 100, 100, 100)];
    lab.text = @"Hello World!";
    
    [self.view addSubview: lab];
}

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view, typically from a nib.
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

@end
