/*
 * Copyright 2013 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.cloud.solutions.griddler.android;

/**
 * Configuration constants for Griddler mobile game backend.
 */
public class GameBackendSettings {

  /**
   * Audience ID used for making authenticated calls.
   */

  public static final String AUDIENCE_ID = "server:client_id:Your Web Client ID";

  /**
   * Sender ID used for receiving push notification from Google Cloud Messaging for Android.
   */

  public static final String GCM_SENDER_ID = "Your project number from API Console";

  /**
   * Root URL for Griddler game backend API.
   */

  public static final String DEFAULT_ROOT_URL = "https://your_app_id.appspot.com/_ah/api/";
}
