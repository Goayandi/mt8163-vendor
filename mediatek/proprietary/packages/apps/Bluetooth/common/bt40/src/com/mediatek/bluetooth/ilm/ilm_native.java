/* Copyright Statement:
 *
 * This software/firmware and related documentation ("MediaTek Software") are
 * protected under relevant copyright laws. The information contained herein is
 * confidential and proprietary to MediaTek Inc. and/or its licensors. Without
 * the prior written permission of MediaTek inc. and/or its licensors, any
 * reproduction, modification, use or disclosure of MediaTek Software, and
 * information contained herein, in whole or in part, shall be strictly
 * prohibited.
 *
 * MediaTek Inc. (C) 2010. All rights reserved.
 *
 * BY OPENING THIS FILE, RECEIVER HEREBY UNEQUIVOCALLY ACKNOWLEDGES AND AGREES
 * THAT THE SOFTWARE/FIRMWARE AND ITS DOCUMENTATIONS ("MEDIATEK SOFTWARE")
 * RECEIVED FROM MEDIATEK AND/OR ITS REPRESENTATIVES ARE PROVIDED TO RECEIVER
 * ON AN "AS-IS" BASIS ONLY. MEDIATEK EXPRESSLY DISCLAIMS ANY AND ALL
 * WARRANTIES, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE OR
 * NONINFRINGEMENT. NEITHER DOES MEDIATEK PROVIDE ANY WARRANTY WHATSOEVER WITH
 * RESPECT TO THE SOFTWARE OF ANY THIRD PARTY WHICH MAY BE USED BY,
 * INCORPORATED IN, OR SUPPLIED WITH THE MEDIATEK SOFTWARE, AND RECEIVER AGREES
 * TO LOOK ONLY TO SUCH THIRD PARTY FOR ANY WARRANTY CLAIM RELATING THERETO.
 * RECEIVER EXPRESSLY ACKNOWLEDGES THAT IT IS RECEIVER'S SOLE RESPONSIBILITY TO
 * OBTAIN FROM ANY THIRD PARTY ALL PROPER LICENSES CONTAINED IN MEDIATEK
 * SOFTWARE. MEDIATEK SHALL ALSO NOT BE RESPONSIBLE FOR ANY MEDIATEK SOFTWARE
 * RELEASES MADE TO RECEIVER'S SPECIFICATION OR TO CONFORM TO A PARTICULAR
 * STANDARD OR OPEN FORUM. RECEIVER'S SOLE AND EXCLUSIVE REMEDY AND MEDIATEK'S
 * ENTIRE AND CUMULATIVE LIABILITY WITH RESPECT TO THE MEDIATEK SOFTWARE
 * RELEASED HEREUNDER WILL BE, AT MEDIATEK'S OPTION, TO REVISE OR REPLACE THE
 * MEDIATEK SOFTWARE AT ISSUE, OR REFUND ANY SOFTWARE LICENSE FEES OR SERVICE
 * CHARGE PAID BY RECEIVER TO MEDIATEK FOR SUCH MEDIATEK SOFTWARE AT ISSUE.
 *
 * The following software/firmware and/or related documentation ("MediaTek
 * Software") have been modified by MediaTek Inc. All revisions are subject to
 * any receiver's applicable license agreements with MediaTek Inc.
 */

/* !---- DO NOT EDIT: This file autogenerated by com\sun\gluegen\JavaEmitter.java on Thu Dec 09 13:33:35 GMT+08:00 2010 ----! */

package com.mediatek.bluetooth.ilm;

public class ilm_native
{

  /** Defined as part of enum type "module_type" */
  public static final int MOD_BT = 0;
  /** Defined as part of enum type "module_type" */
  public static final int MOD_TIMER = 1;
  /** Defined as part of enum type "module_type" */
  public static final int MOD_MMI = 2;
  /** Defined as part of enum type "module_type" */
  public static final int MOD_TST = 3;
  /** Defined as part of enum type "module_type" */
  public static final int MOD_SPP_DEFAULT = 4;
  /** Defined as part of enum type "module_type" */
  public static final int END_OF_MOD_ID = 5;
  /** Defined as part of enum type "ext_interlayer_socket_namespace_enum" */
  public static final int EXT_IL_SOCKET_NAMESPACE_ABSTRACT = 0;
  /** Defined as part of enum type "ext_interlayer_socket_namespace_enum" */
  public static final int EXT_IL_SOCKET_NAMESPACE_RESERVED = 1;
  /** Defined as part of enum type "ext_interlayer_socket_namespace_enum" */
  public static final int EXT_IL_SOCKET_NAMESPACE_FILESYSTEM = 2;
  public static final int NULL = 0;
  public static final int MAX_ILM_BUFFER_SIZE = 2048;

  /** Interface to C language function: <br> <code> void close_socket(int socketfd); </code>    */
  public static native void close_socket(int socketfd);

  /** Interface to C language function: <br> <code> int create_client_socket(const char *  name, ext_interlayer_socket_namespace_enum namespace); </code>
      @param namespace valid values are: <code>EXT_IL_SOCKET_NAMESPACE_ABSTRACT, EXT_IL_SOCKET_NAMESPACE_RESERVED, EXT_IL_SOCKET_NAMESPACE_FILESYSTEM</code>
   */
  public static native int create_client_socket(java.lang.String name, int namespace);

  /** Interface to C language function: <br> <code> int create_server_socket(const char *  name, ext_interlayer_socket_namespace_enum namespace); </code>
      @param namespace valid values are: <code>EXT_IL_SOCKET_NAMESPACE_ABSTRACT, EXT_IL_SOCKET_NAMESPACE_RESERVED, EXT_IL_SOCKET_NAMESPACE_FILESYSTEM</code>
   */
  public static native int create_server_socket(java.lang.String name, int namespace);

  /** Interface to C language function: <br> <code> void print_message_id(); </code>    */
  public static native void print_message_id();

  /** Interface to C language function: <br> <code> int recv_message(int socketfd, ilm_struct *  ilm); </code>    */
  public static int recv_message(int socketfd, Message ilm)
  {
        return recv_message0(socketfd, ((ilm == null) ? null : ilm.getBuffer()));
  }

  /** Entry point to C language function: <code> int recv_message(int socketfd, ilm_struct *  ilm); </code>    */
  private static native int recv_message0(int socketfd, java.nio.ByteBuffer ilm);

  /** Interface to C language function: <br> <code> int send_message(int socketfd, ilm_struct *  message, int size); </code>    */
  public static int send_message(int socketfd, Message message, int size)
  {
        return send_message0(socketfd, ((message == null) ? null : message.getBuffer()), size);
  }

  /** Entry point to C language function: <code> int send_message(int socketfd, ilm_struct *  message, int size); </code>    */
  private static native int send_message0(int socketfd, java.nio.ByteBuffer message, int size);


  // --- Begin CustomJavaCode .cfg declarations
    static {
        System.loadLibrary("extsys_jni");
    }
  // ---- End CustomJavaCode .cfg declarations

} // end of class ilm_native