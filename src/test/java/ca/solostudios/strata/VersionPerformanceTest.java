/*
 * Strata - A library for parsing and comparing version strings
 * Copyright (c) 2021-2021 solonovamax <solonovamax@12oclockpoint.com>
 *
 * The file VersionPerformanceTest.java is part of Strata
 * Last modified on 24-09-2021 11:57 p.m.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * STRATA IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package ca.solostudios.strata;


import ca.solostudios.strata.parser.tokenizer.ParseException;
import org.junit.jupiter.api.Test;

import static ca.solostudios.strata.Versions.parseVersion;
import static ca.solostudios.strata.Versions.parseVersionRange;


public class VersionPerformanceTest {
    @Test
    @SuppressWarnings({ "JUnitTestMethodWithNoAssertions", "ResultOfMethodCallIgnored" })
    void testVersionParseSpeed() throws ParseException {
        for (int i = 0; i < 1_000_000; i++) {
            parseVersion("1.2.3");
        }
    }
    
    @Test
    @SuppressWarnings({ "JUnitTestMethodWithNoAssertions", "ResultOfMethodCallIgnored" })
    void testVersionBoundedRangeParseSpeed() throws ParseException {
        for (int i = 0; i < 1_000_000; i++) {
            parseVersionRange("[1.2.3,4.5.6]");
        }
    }
    
    @Test
    @SuppressWarnings({ "JUnitTestMethodWithNoAssertions", "ResultOfMethodCallIgnored" })
    void testVersionGlobRangeParseSpeed() throws ParseException {
        for (int i = 0; i < 1_000_000; i++) {
            parseVersionRange("1.2.+");
        }
    }
}
