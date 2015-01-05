Enter topic, partition, start offset, end offset,

this tools will fetch messages between these two offsets (and messages of start offset and

end offset, so you can set these two offsets to be the same, to fetch that message alone).

It will also show you the latest offset and oldest offset available.

Tested with Kafka 0.8.1.1

# Overview

![KafkaReader](/shot.png?raw=false)

#Run it
You should has sbt installed in you computer. Execute

```
sbt pack-archive
```

Then you can find a tarball file in the target directory of your project. Run it