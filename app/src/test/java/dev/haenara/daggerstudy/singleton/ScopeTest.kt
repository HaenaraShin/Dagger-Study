package dev.haenara.daggerstudy.singleton

import dev.haenara.daggerstudy.singletone.DaggerSingletonComponent
import dev.haenara.daggerstudy.singletone.SingletonComponent
import junit.framework.Assert.assertNotNull
import junit.framework.Assert.assertSame
import org.junit.Test

class ScopeTest {
    @Test
    fun `singleton scope test`() {
        val component = DaggerSingletonComponent.create()
        val obj1 = component.getObject()
        val obj2 = component.getObject()
        assertNotNull(obj1)
        assertNotNull(obj2)
        assertSame(obj1, obj2)
    }
}