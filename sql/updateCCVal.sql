UPDATE VSUC_EMPRESAS_TLCC
SET BDVALOR = BDVALOR + :value
WHERE
BDCODEMP = :enterprise
AND BDCHAVE = :key
AND BDCODTPCC = :centerCost