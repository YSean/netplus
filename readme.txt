--20151025
建立git版本库
http://www.liaoxuefeng.com/wiki/0013739516305929606dd18361248578c67b8067c8c017b000/0013743256916071d599b3aed534aaab22a0db6c4e07fd0000

git add files 添加准备提交的文件{放到暂存区}
git commit -m "commit message" 提交
git status 同步
git diff 对比文件
git log 查看版本
git log --pretty=online
git reset 回退版本
git reflog 可以记录每次执行命令的版本号
git checkout -- files 相当于SVN 的 reverts
git rm 在版本库中删除文件	

--
gitHub生成密钥对
ssh-keygen -t rsa -C "gdut_cb@163.com"
git remote 查看远程版本库名称
git remote -v 详细信息
git remote add 代号 地址

git remote add origin git@github.com:yogaling/netplus.git
git remote add origin https://github.com/yogaling/netplus.git
git clone git@github.com:yogaling/test.git
相当于SVN的checkout
git push -u origin master
由于远程库是空的，我们第一次推送master分支时，加上了-u参数，Git不但会把本地的master分支内容推送的远程新的master分支，还会把本地的master分支和远程的master分支关联起来，在以后的推送或者拉取时就可以简化命令


master是主分支
git push -u origin dev
推送到dev的分支上
但是，并不是一定要把本地分支往远程推送，那么，哪些分支需要推送，哪些不需要呢？
master分支是主分支，因此要时刻与远程同步；
dev分支是开发分支，团队所有成员都需要在上面工作，所以也需要与远程同步；
bug分支只用于在本地修复bug，就没必要推到远程了，除非老板要看看你每周到底修复了几个bug；
feature分支是否推到远程，取决于你是否和你的小伙伴合作在上面开发。


--分支管理
git branch dev
	创建分支
git branch -d feature1
	删除分支，没有合并不能删除
git branch -D feature-vulcan
	强行删除分支
git merge
	合并版本	
--打标签
Git的标签虽然是版本库的快照，但其实它就是指向某个commit的指针（跟分支很像对不对？但是分支可以移动，标签不能移动），所以，创建和删除标签都是瞬间完成的。
git tag
	查看所有标签
git tag v1.0
	打标签
git tag v0.9 6224937
	默认打最新的commitid，如果需要在历史的commitid上打标签，可以查看日志，再打标签
	git log --pretty=oneline --abbrev-commit
git tag -a v0.1 -m "version 0.1 released" 3628164
	可以创建带有说明的标签，用-a指定标签名，-m指定说明文字：
git tag -s v0.2 -m "signed version 0.2 released" fec145a
	还可以通过-s用私钥签名一个标签：可以用PGP签名标签
git tag -d v0.1
	删除标签
git show v0.9
	查看标签信息
git push origin v1.0
	推送某个标签到远程
git push origin --tags
	推送所有标签到远程
git tag -d v0.9
git push origin :refs/tags/v0.9
	先从本地删除，再删除远程的标签


--配置git
git config --global color.ui true
	配置颜色
--忽略文件
不需要从头写.gitignore文件，GitHub已经为我们准备了各种配置文件，只需要组合一下就可以使用了。所有配置文件可以直接在线浏览：https://github.com/github/gitignore

忽略文件的原则是：

忽略操作系统自动生成的文件，比如缩略图等；
忽略编译生成的中间文件、可执行文件等，也就是如果一个文件是通过另一个文件自动生成的，那自动生成的文件就没必要放进版本库，比如Java编译产生的.class文件；
忽略你自己的带有敏感信息的配置文件，比如存放口令的配置文件。

使用Windows的童鞋注意了，如果你在资源管理器里新建一个.gitignore文件，它会非常弱智地提示你必须输入文件名，但是在文本编辑器里“保存”或者“另存为”就可以把文件保存为.gitignore了。