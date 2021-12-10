package br.com.sebastiao.junior

import io.micronaut.context.ApplicationContext
import io.netty.util.internal.EmptyArrays
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.*
import kotlin.collections.ArrayList

internal class ApplicationKtTest {

    @Test
    fun contextLoads() {
        br.com.sebastiao.junior.main(Collections.emptyList<String>().toTypedArray())
    }
}