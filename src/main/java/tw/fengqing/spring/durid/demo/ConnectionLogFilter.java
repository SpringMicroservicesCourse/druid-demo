package tw.fengqing.spring.durid.demo;

import com.alibaba.druid.filter.FilterChain;
import com.alibaba.druid.filter.FilterEventAdapter;
import com.alibaba.druid.proxy.jdbc.ConnectionProxy;
import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

@Slf4j
public class ConnectionLogFilter extends FilterEventAdapter {

    @Override
    public void connection_connectBefore(FilterChain chain, Properties info) {
        log.info("連接建立前：開始連接資料庫!");
    }

    @Override
    public void connection_connectAfter(ConnectionProxy connection) {
        log.info("連接建立後：資料庫連接成功!");
    }
}
