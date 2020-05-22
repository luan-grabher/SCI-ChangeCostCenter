select * from VSUC_EMPRESAS_TLAN L
WHERE L.BDCODEMP = :enterpriseCode
AND L.BDREFERENCIA = :reference
AND (SELECT COUNT(*) FROM VSUC_EMPRESAS_TLCC C WHERE C.BDCODEMP = :enterpriseCode AND C.BDCHAVE = L.BDCHAVE) = 0
