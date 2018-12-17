/*
 * Symphony - A modern community (forum/BBS/SNS/blog) platform written in Java.
 * Copyright (C) 2012-2018, b3log.org & hacpai.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package org.b3log.symphony.model;

import org.b3log.symphony.model.UserExt;
import org.junit.Assert;
import org.junit.Test;

public class UserExtTest {

    @Test
    public void toCCStringInputPositiveOutputNotNull() {
        final int point = 1_043_562;
        final String retval = UserExt.toCCString(point);
        Assert.assertEquals("fec6aa", retval);
    }

    @Test
    public void toCCStringInputPositiveOutputNotNull2() {
        final int point = 16_696_993;
        final String retval = UserExt.toCCString(point);
        Assert.assertEquals("fec6a1", retval);
    }

    @Test
    public void toCCStringInputPositiveOutputNotNull3() {
        final int point = 65_222;
        final String retval = UserExt.toCCString(point);
        Assert.assertEquals("fec6c6", retval);
    }

    @Test
    public void toCCStringInputPositiveOutputNotNull4() {
        final int point = 267_151_889;
        final String retval = UserExt.toCCString(point);
        Assert.assertEquals("fec6a1", retval);
    }

    @Test
    public void toCCStringInputPositiveOutputNotNull5() {
        final int point = 10;
        final String retval = UserExt.toCCString(point);
        Assert.assertEquals("aaaaaa", retval);
    }

    @Test
    public void toCCStringInputPositiveOutputNotNull6() {
        final int point = 25;
        final String retval = UserExt.toCCString(point);
        Assert.assertEquals("111999", retval);
    }

    @Test
    public void toCCStringInputPositiveOutputNotNull7() {
        final int point = 404;
        final String retval = UserExt.toCCString(point);
        Assert.assertEquals("119944", retval);
    }

}
