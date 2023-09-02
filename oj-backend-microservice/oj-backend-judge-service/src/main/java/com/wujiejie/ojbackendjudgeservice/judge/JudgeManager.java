package com.wujiejie.ojbackendjudgeservice.judge;

import com.wujiejie.ojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.wujiejie.ojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.wujiejie.ojbackendjudgeservice.judge.strategy.JudgeContext;
import com.wujiejie.ojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.wujiejie.ojbackendmodel.model.codesandbox.JudgeInfo;
import com.wujiejie.ojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
