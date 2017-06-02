def ant=new AntBuilder()
def sname=sourceName
def tname=targetName
ant.move(file:"$sname", toFile:"$tname")