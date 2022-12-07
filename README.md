# Covered Parts 
## Adding 'Sleuth' dependency 
<i>Tracing is simple, in theory. As a request flows from one component to another in a system, through ingress and egress points, tracers add logic where possible to perpetuate a unique trace ID that’s generated when the first request is made. As a request arrives at a component along its journey, a new span ID is assigned for that component and added to the trace. A trace represents the whole journey of a request, and a span is each individual hop along the way, each request. Spans may contain tags, or metadata, that can be used to later contextualize the request. Spans typically contain common tags like start timestamps and stop timestamp, though it’s easy to associate semantically relevant tags like an a business entity ID with a span..</i>
## 'Zipkin' dashboard preview 
<i>The Zipkin web UI makes it easy to analyze and query Zipkin data ,bring up the UI and then find all the recent traces. You can sort by most recent, longest, etc., for finer-grained control over which results you see :</i>

![image](https://user-images.githubusercontent.com/84160502/206288855-943c2afe-9dbc-4d70-9d6a-c74bb08d5a48.png)

<i>When I click on one of the traces that comes back, I get a UI that looks like this :</i>

![image](https://user-images.githubusercontent.com/84160502/206288977-0fb88223-cd0d-4326-a4d3-f4b348e8a635.png)


