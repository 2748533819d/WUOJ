package com.wujiejie.ojbackendjudgeservice.judge.codesandbox.impl;

import com.wujiejie.ojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.wujiejie.ojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.wujiejie.ojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 第三方代码沙箱（调用网上现成的代码沙箱）
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
