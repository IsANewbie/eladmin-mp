
package com.dgm.modules.quartz.config;

import com.dgm.modules.quartz.mapper.QuartzJobMapper;
import lombok.RequiredArgsConstructor;
import com.dgm.modules.quartz.domain.QuartzJob;
import com.dgm.modules.quartz.utils.QuartzManage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * @author Zheng Jie
 * @date 2019-01-07
 */
@Component
@RequiredArgsConstructor
public class JobRunner implements ApplicationRunner {
    private static final Logger log = LoggerFactory.getLogger(JobRunner.class);
    private final QuartzJobMapper quartzJobMapper;
    private final QuartzManage quartzManage;

    /**
     * 项目启动时重新激活启用的定时任务
     *
     * @param applicationArguments /
     */
    @Override
    public void run(ApplicationArguments applicationArguments) {
        List<QuartzJob> quartzJobs = quartzJobMapper.findByIsPauseIsFalse();
        quartzJobs.forEach(quartzManage::addJob);
        log.info("Timing task injection complete");
    }
}
