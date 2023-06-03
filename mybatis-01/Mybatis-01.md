# 问题

## test测试缺少资源

如图所示

![image.png](https://raw.githubusercontent.com/8uzzlightyear/Image-host/main/images/20230603171106.png)

在 Maven 项目中，需要将资源文件打包到 build 中以便使用。可以在 `pom.xml` 文件中配置 `resources` 元素将资源文件打包到 build 中。

***并刷新MAVEN***

![image.png](https://raw.githubusercontent.com/8uzzlightyear/Image-host/main/images/20230603171448.png)


```XML
<build>
  <resources>
    <resource>
      <directory>src/main/java</directory>
      <includes>
        <include>**/*.properties</include>
        <include>**/*.xml</include>
      </includes>
      <filtering>true</filtering>
    </resource>
    <resource>
      <directory>src/main/resources</directory>
      <includes>
        <include>**/*.properties</include>
        <include>**/*.xml</include>
      </includes>
      <filtering>true</filtering>
    </resource>
  </resources>
</build>
```

## 空指针异常

在MybatisUtils类中`sqlSessionFactory`不能在try代码块中再申明一次
![image.png](https://raw.githubusercontent.com/8uzzlightyear/Image-host/main/images/20230603171746.png)
