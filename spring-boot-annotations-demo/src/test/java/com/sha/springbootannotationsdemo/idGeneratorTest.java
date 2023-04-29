package com.sha.springbootannotationsdemo;

import com.sha.springbootannotationsdemo.idgenerator.model.DefaultOne;
import com.sha.springbootannotationsdemo.idgenerator.model.IdentityOne;
import com.sha.springbootannotationsdemo.idgenerator.repository.IDefaultOneRepository;
import com.sha.springbootannotationsdemo.idgenerator.repository.IIdentityOneRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class idGeneratorTest {
    @Autowired
    private IDefaultOneRepository defaultOneRepository;
    @Autowired
    private IIdentityOneRepository identityOneRepository;
    //auto id next-value: update default_one_seq set next_val= ? where next_val=?
    @Test
    public void save_auto_test()
    {
        DefaultOne defaultOne = new DefaultOne();
        defaultOne.setName("Test");

        defaultOneRepository.save(defaultOne);
    }

    @Test
    public void save_indentity_test()
    {
        IdentityOne identityOne = new IdentityOne();
        identityOne.setName("Test");

        identityOneRepository.save(identityOne);
    }
}
