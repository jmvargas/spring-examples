package com.privalia.perfiles;

import com.privalia.presentation.annotations.SpringConfiguration;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@ActiveProfiles("prod")
@ContextConfiguration(classes={ProdEnvConfig.class})
public class ProdUser {

    @ClassRule
    public static final SpringClassRule SPRING_CLASS_RULE = new SpringClassRule();

    @Rule
    public final SpringMethodRule springMethodRule = new SpringMethodRule();

    @Autowired
    private User subject;

    @Test
    public void testDependency(){
        assertNotNull(subject);
        assertEquals(new Integer(222), subject.id);
        assertEquals("Prod user", subject.name);
    }
}
