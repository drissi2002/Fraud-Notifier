# Covered parts
## Adding 'apigw'
<i>Clients make requests to Spring Cloud Gateway. If the Gateway Handler Mapping determines that a request matches a route, it is sent to the Gateway Web Handler. This handler runs the request through a filter chain that is specific to the request. The reason the filters are divided by the dotted line is that filters can run logic both before and after the proxy request is sent. All “pre” filter logic is executed. Then the proxy request is made. After the proxy request is made, the “post” filter logic is run.</i>
## Architecture preview 

<img width="772" alt="Sans titre" src="https://user-images.githubusercontent.com/84160502/206310504-80cb452d-12fb-4759-b1ae-8a2e1cedd0df.png">
## Zipkin tracing 

![image](https://user-images.githubusercontent.com/84160502/206310642-3badf8e0-7be7-4f52-a652-b2e4fbaae654.png)

## Some 'LoadBlancer' Algorithms for Clients requests
<img width="754" alt="Sans titre1" src="https://user-images.githubusercontent.com/84160502/206310778-a8711a10-6f16-42fa-8566-3824a0fdbf7d.png">

