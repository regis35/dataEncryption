## Install vault (docker mode)

link to documentation https://hub.docker.com/r/hashicorp/vault

access to vault admin -> http://localhost:8300/ui

/ # vault status

Key             Value
---             -----
Seal Type       shamir
Initialized     true
Sealed          false
Total Shares    1
Threshold       1
Version         1.18.1
Build Date      2024-10-29T14:21:31Z
Storage Type    inmem
Cluster Name    vault-cluster-9b06dc98
Cluster ID      4497c9c5-7212-580d-d318-e672d890b49b
HA Enabled      false
/ # 

When vault application is in dev mode, when your restart container all keys are lost.

# Vault configuration

Create new key

    vault kv put secret/vault myconf.login=regis
    vault kv put secret/vault myconf.password=cestquoilecode
    


vault secrets enable -path=secret kv

vault kv put secret/vault myconf.username=demouser myconf.password=demopassword
vault kv put secret/vault/cloud myconf.username=clouduser myconf.password=cloudpassword

Rotation de clé

    vault secrets enable transit

Create a Transit Key
Create a key for encryption and enable key rotation.

    vault write -f transit/keys/my-encryption-key

Verify the Key
Check the details of the created key:

    vault read transit/keys/my-encryption-key

Rotate the Key
Rotate the key to generate a new version:

    vault write -f transit/keys/my-encryption-key/rotate


