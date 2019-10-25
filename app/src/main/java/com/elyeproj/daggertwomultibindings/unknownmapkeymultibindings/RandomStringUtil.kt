package com.elyeproj.daggertwomultibindings.unknownmapkeymultibindings

import java.security.SecureRandom

object RandomStringUtil {

    private val CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz"
    private val CHAR_UPPER = CHAR_LOWER.toUpperCase()
    private val NUMBER = "0123456789"

    private val DATA_FOR_RANDOM_STRING = CHAR_LOWER + CHAR_UPPER + NUMBER
    private val random = SecureRandom()
    private val length = 3

    fun randomStringGenerator(): String {
        require(length >= 1)

        val sb = StringBuilder(length)
        for (i in 0 until length) {

            // 0-62 (exclusive), random returns 0-61
            val rndCharAt = random.nextInt(DATA_FOR_RANDOM_STRING.length)
            val rndChar = DATA_FOR_RANDOM_STRING[rndCharAt]

            // debug
            // System.out.format("%d\t:\t%c%n", rndCharAt, rndChar);

            sb.append(rndChar)

        }

        return sb.toString()
    }
}
