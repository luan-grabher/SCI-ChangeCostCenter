select
    BDCODEMP,
    BDCHAVE,
    BDCODPLAPADRAO,
    BDDEBITO,
    BDCREDITO,
    BDDATA,
    BDVALOR,
    BDCOMPL,
    BDTIPOLAN,
    BDDCTO,
    BDCODUSU,
    BDCODTERCEIROD,
    BDCODTERCEIROC,
    (SELECT COUNT(*) FROM VSUC_EMPRESAS_TLCC C WHERE C.BDCODEMP = :enterpriseCode AND C.BDCHAVE = L.BDCHAVE) as CC_COUNT
from VSUC_EMPRESAS_TLAN L
WHERE L.BDCODEMP = :enterprise
:complement
:account
:value
and L.BDTIPOLANORIG  = 100