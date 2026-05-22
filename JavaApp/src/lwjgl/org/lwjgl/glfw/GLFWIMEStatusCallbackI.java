/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

public interface GLFWIMEStatusCallbackI extends CallbackI {
    void invoke(long window, boolean focused);
}
