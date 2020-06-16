package com.netflix.loadbalancer;

/**
 * Defines the strategy, used to ping all servers, registered in
 * <c>com.netflix.loadbalancer.BaseLoadBalancer</c>. You would
 * typically create custom implementation of this interface, if you
 * want your servers to be pinged in parallel. <b>Please note,
 * that implementations of this interface should be immutable.</b>
 * TODO: 定义用于ping所有服务器的策略，毕竟一般单ping一台机器的意义不大
 * @author Dmitry_Cherkas
 * @see Server
 * @see IPing
 */
public interface IPingStrategy {

    /**
     * 使用IPing 对传入的server分别进行ping,返回结果，所以可以理解它就是一个批量操作而已
     * @param ping
     * @param servers
     * @return
     */
    boolean[] pingServers(IPing ping, Server[] servers);
}
