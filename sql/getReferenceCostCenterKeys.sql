SELECT 
LIST(DISTINCT C.BDCHAVE)
FROM VSUC_EMPRESAS_TLCC C
INNER JOIN VSUC_EMPRESAS_TLAN L
ON L.BDCODEMP = C.BDCODEMP AND L.BDCHAVE = C.BDCHAVE
WHERE C.BDCODEMP = :enterprise AND L.BDREFERENCIA = :reference and L.BDTIPOLANORIG  = 100