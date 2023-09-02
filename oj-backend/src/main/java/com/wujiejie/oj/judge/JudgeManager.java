package com.wujiejie.oj.judge;

import com.wujiejie.oj.judge.strategy.DefaultJudgeStrategy;
import com.wujiejie.oj.judge.strategy.JavaLanguageJudgeStrategy;
import com.wujiejie.oj.judge.strategy.JudgeContext;
import com.wujiejie.oj.judge.strategy.JudgeStrategy;
import com.wujiejie.oj.judge.codesandbox.model.JudgeInfo;
import com.wujiejie.oj.model.entity.QuestionSubmit;
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
