package gyenam.bitcoinapiparser.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by One0 on 2018. 1. 14..
 */
@AllArgsConstructor
public enum  CoinType {
    BTC("BTC"  , "비트코인"),
    BTG("BTG"  , "비트코인 골드"),
    BCH("BCH"  , "비트코인 캐시"),
    ETH("ETH"  , "이더리움"),
    ETC("ETC"  , "이더리움 클래식"),
    LTC("LTC"  , "라이트코인"),
    XRP("XRP"  , "리플"),
    XMR("XMR"  , "모네로"),
    ZEC("ZEC"  , "지캐시"),
    EOS("EOS"  , "이오스"),
    QTUM("QTUM", "퀀텀"),
    DASH("DASH", "대시"),
    ALL("ALL"  , "ALL");

    @Getter
    private String value;

    private String description;

    @Override
    public String toString() {
        return this.value;
    }
}
