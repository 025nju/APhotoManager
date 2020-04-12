/*
 * Copyright (c) 2020 by k3b.
 *
 * This file is part of #APhotoManager (https://github.com/k3b/APhotoManager/)
 *              and #toGoZip (https://github.com/k3b/ToGoZip/).
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>
 */

package de.k3b.io;

import java.io.File;

/**
 * File api abstraction based on android independand {@link File} API
 */
public class FileApi {
    public static final String TAG = "k3b FILE";

    protected boolean osRenameTo(File dest, File source) {
        return (source != null) && (dest != null) && source.renameTo(dest);
    }

    protected boolean osDeleteFile(File file) {
        return (file != null) && (file.canWrite()) && file.delete();
    }

}
