package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author Chen
 * @created 2019-01-28-21:15.
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class CmsPageRepositoryTest {
    @Autowired
    CmsPageRepository cmsPageRepository;

    @Test
    public void testFindAll() {

        List<CmsPage> all = cmsPageRepository.findAll();
        System.out.println("all的值是：---" + all.size() + "，当前方法=CmsPageRepositoryTest.testFindAll()");
    }

    @Test
    public void testFindPage() {

        Pageable pageable = PageRequest.of(0, 10);
        Page<CmsPage> all = cmsPageRepository.findAll(pageable);
        System.out.println("all的值是：---" + all + "，当前方法=CmsPageRepositoryTest.testFindPage()");

    }
}
