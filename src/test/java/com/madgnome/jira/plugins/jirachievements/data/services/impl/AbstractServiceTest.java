package com.madgnome.jira.plugins.jirachievements.data.services.impl;

import com.atlassian.activeobjects.external.ActiveObjects;
import com.atlassian.activeobjects.test.TestActiveObjects;
import com.madgnome.jira.plugins.jirachievements.data.DatabaseProcessor;
import net.java.ao.EntityManager;
import net.java.ao.test.jdbc.Data;
import net.java.ao.test.jdbc.DynamicJdbcConfiguration;
import net.java.ao.test.jdbc.Jdbc;
import net.java.ao.test.junit.ActiveObjectsJUnitRunner;
import org.junit.runner.RunWith;

@RunWith(ActiveObjectsJUnitRunner.class)
@Jdbc(DynamicJdbcConfiguration.class)
@Data(DatabaseProcessor.class)
public abstract class AbstractServiceTest
{
  protected EntityManager entityManager;

  protected ActiveObjects createActiveObjects()
  {
    return new TestActiveObjects(entityManager);
  }
}
