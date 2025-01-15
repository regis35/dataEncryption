
netstat -lapute

Proto Recv-Q Send-Q Local Address           Foreign Address         State       PID/Program name    
tcp        0      0 0.0.0.0:8200            0.0.0.0:*               LISTEN      -
tcp        0      0 127.0.0.11:36035        0.0.0.0:*               LISTEN      -
tcp        0      0 :::8201                 :::*                    LISTEN      -
udp        0      0 127.0.0.11:38529        0.0.0.0:*                           -
/ # 


/ # netstat -lapute
Active Internet connections (servers and established)
Proto Recv-Q Send-Q Local Address           Foreign Address         State       PID/Program name    
tcp        0      0 127.0.0.11:36261        0.0.0.0:*               LISTEN      -
udp        0      0 127.0.0.11:46583        0.0.0.0:*                           -
/ # 


docker run --cap-add=IPC_LOCK 
-e 'VAULT_LOCAL_CONFIG={"storage": {"file": {"path": "/vault/file"}}, 
"listener": [{"tcp": { "address": "0.0.0.0:8200", "tls_disable": true}}], 
"default_lease_ttl": "168h", "max_lease_ttl": "720h", "ui": true}' 
-p 8200:8200 hashicorp/vault server


