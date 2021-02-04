SELECT L.BDCHAVE AS CHAVE, L.BDVALOR AS LANCAMENTO, SUM(CC.BDVALOR) AS CENTRODECUSTO, L.BDVALOR - SUM(CC.BDVALOR) AS DIFERENCA FROM VSUC_EMPRESAS_TLAN L
INNER JOIN VSUC_EMPRESAS_TLCC CC
ON L.BDCODEMP = CC.BDCODEMP AND CC.BDCHAVE = L.BDCHAVE
WHERE
L.BDCODEMP = :enterprise
AND L.BDREFERENCIA = :reference
:account /*AND L.BDCREDITO = 265*/
GROUP BY L.BDCHAVE, L.BDVALOR
HAVING (L.BDVALOR - SUM(CC.BDVALOR)) <> 0