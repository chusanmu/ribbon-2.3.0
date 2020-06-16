/*
*
* Copyright 2013 Netflix, Inc.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*
*/
package com.netflix.loadbalancer;

/**
 * Interface that defines how we "ping" a server to check if its alive
 * @author stonse
 * TODO: 定义如何ping 服务器以检查其是否是活动的接口，类似于心跳检测
 *
 */
public interface IPing {
    
    /**
     * Checks whether the given <code>Server</code> is "alive" i.e. should be
     * considered a candidate while loadbalancing
     * TODO: 检查给定server是否是活着的, IPing#isAlive()方法是由timer定时调用的，pingIntervalSeconds默认值是30s，也就是说30s会去心跳一次server,看它是否活着，可以通过key: NFLoadBalancerPingInterval自己配置的
     * 
     */
    public boolean isAlive(Server server);
}
