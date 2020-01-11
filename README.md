# consul
consul+feign服务注册与发现
以开发模式启动consul agent:
consul agent -dev -client=0.0.0.0

consul-provider  端口:8763
consul-consumer  端口:8765
客户端调用地址:
http://192.168.230.110:8765/hi2?name=tom
