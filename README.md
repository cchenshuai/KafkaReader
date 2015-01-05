Enter topic, partition, start offset, end offset,
this tools will fetch messages between these two offsets (and messages of start offset and
end offset, so you can set these two offset to be the same, to fetch that message alone).

Tested with Kafka 0.8.1.1
# Overview

![KafkaReader](/shot.png?raw=false)

#Run it
You should has a sbt installed in you computer.
execute

```
pack-archive
```
Then you can find a tarball file in the target directory of your project.

run it