/*
 * Copyright (C) 1999 - 2001, International Business Machines Corporation.
 * All Rights Reserved. Provided and licensed under the terms and
 * conditions of the Common Public License:
 * http://oss.software.ibm.com/developerworks/opensource/license-cpl.html
 *
 * (C) 2014 Key Bridge LLC. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package javax.usb3.exception;

/**
 * Exception indicating a device has been disconnected.
 * <p>
 * This indicates the device has been disconnected from the system. This is a
 * terminal error; the UsbDevice and subcomponents are no longer usable. If the
 * physical device is reconnected, a new UsbDevice (and subcomponents) will be
 * created.
 *
 * @author Dan Streetman
 * @author Jesse Caulfield
 */
public class UsbDisconnectedException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  /**
   * Constructor.
   */
  public UsbDisconnectedException() {
    super();
  }

  /**
   * Constructor.
   *
   * @param s The detail message.
   */
  public UsbDisconnectedException(String s) {
    super(s);
  }
}
