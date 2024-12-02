ui = true
# api_addr      = "https://127.0.0.1:8200"
disable_mlock = true
# disable_clustering = true
# default_lease_ttl = 168h
# max_lease_ttl = 720h

storage "file" {
  path = "/vault/data"
}

listener "tcp" {
#   address = "127.0.0.1:8201"
  address = "0.0.0.0:8201"
  cluster_address = "127.0.0.1:8201"
  tls_disable = 1
}

