/*
 * Strata - A library for parsing and comparing version strings
 * Copyright (c) 2021-2021 solonovamax <solonovamax@12oclockpoint.com>
 *
 * The file Versions.java is part of Strata
 * Last modified on 17-07-2021 09:32 p.m.
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

package com.solostudios.strata;


import com.solostudios.strata.version.Version;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;


public final class Versions {
    private Versions() {
    }

//    public static Version getVersion(int major) {
//        return new Version(major, 0, 0);
//    }
//
//    public static Version getVersion(int major, int minor) {
//        return new Version(major, minor, 0);
//    }
//
//    public static Version getVersion(int major, int minor, int patch) {
//        return new Version(major, minor, patch);
//    }
    
    @NotNull
    @Contract(pure = true)
    public static Version parseVersion(String versionString) {
        return null;
    }
}
