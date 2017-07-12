/*
 * Copyright (c) 2016, Salesforce.com, Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * 3. Neither the name of Salesforce.com nor the names of its contributors may
 * be used to endorse or promote products derived from this software without
 * specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
	 
package com.salesforce.dva.argus.service.tsdb;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.salesforce.dva.argus.service.MonitorService;
import com.salesforce.dva.argus.service.metric.transform.TransformFactory;
import com.salesforce.dva.argus.system.SystemConfiguration;

/**
 * A Singleton implementation of the TSDBService.
 *
 * @author  Bhinav Sura (bhinav.sura@salesforce.com)
 */
@Singleton
public class SingletonTSDBService extends DefaultTSDBService {

    //~ Constructors *********************************************************************************************************************************

    /**
     * Creates a new SingletonTSDBService object.
     *
     * @param  config               The system configuration.  Cannot be null.
     * @param  monitorService       The monitor service used to collect query time window counters. Cannot be null.
     * @param  transformFactory     Transform Factory
     */
    @Inject
    private SingletonTSDBService(SystemConfiguration config, MonitorService monitorService, TransformFactory transformFactory) {
        super(config, monitorService, transformFactory);
    }
}
/* Copyright (c) 2016, Salesforce.com, Inc.  All rights reserved. */
