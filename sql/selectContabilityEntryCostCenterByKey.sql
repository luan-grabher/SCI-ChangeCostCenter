SELECT 
C.BDCODEMP, ----0
C.BDCHAVE,------1
C.BDCODCENTRO,--2
C.BDCODTPCC,----3
C.BDDEBCRE,-----4
C.BDVALOR------5
FROM VSUC_EMPRESAS_TLCC C
WHERE C.BDCODEMP = :enterpriseCode and C.BDCHAVE = :key