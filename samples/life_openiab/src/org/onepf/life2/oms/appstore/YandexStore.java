/*******************************************************************************
 * Copyright 2013 One Platform Foundation
 *
 *       Licensed under the Apache License, Version 2.0 (the "License");
 *       you may not use this file except in compliance with the License.
 *       You may obtain a copy of the License at
 *
 *           http://www.apache.org/licenses/LICENSE-2.0
 *
 *       Unless required by applicable law or agreed to in writing, software
 *       distributed under the License is distributed on an "AS IS" BASIS,
 *       WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *       See the License for the specific language governing permissions and
 *       limitations under the License.
 ******************************************************************************/

package org.onepf.life2.oms.appstore;

import org.onepf.life2.oms.Appstore;
import org.onepf.life2.oms.AppstoreService;

/**
 * Author: Ruslan Sayfutdinov
 * Date: 16.04.13
 */
public class YandexStore implements Appstore {
    @Override
    public boolean isAppPresented(String packageName) {
        return false;
    }

    @Override
    public boolean isInstaller(String packageName) {
        return false;
    }

    @Override
    public boolean isServiceSupported(AppstoreService appstoreService) {
        return false;
    }

    @Override
    public AppstoreInAppBillingService getInAppBillingService() {
        return null;
    }
}
