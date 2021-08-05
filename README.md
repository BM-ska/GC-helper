# GC-helper

## Hi!

Welcome to GC-helper! This tool was created with Geocacher's demand in mind. Below I advertise **How to set up this app locally**, **instruction for users**, **the documentation for programmers** and **application extension prospects**!

## Table of contents
* [How to set up this app locally](#How-to-set-up-this-app-locally)
* [How to run an app](#How-to-run-an-app)
* [Instruction for users](#Instruction-for-users)
* [Documantation for programmers](#Documantation-for-programmers)
* [Application extension prospects](#Application-extension-prospects)

## How to set up this app locally
First you have to download sourcecode from GitHub. To do this go to your IDE and then import from Version Control **URI:** https://github.com/BM-ska/GC-helper.git

Download all dependencies from Maven. If IDE does not upload this project as maven project, right click on the pom.xml file -> Add as Maven project.

If you have done this now you have to set up three things:
* [How to set up Database](#Database)
* [How to set up Backend](#Backend)
* [How to set up Frontend](#Frontend)

### Database

### Backend

### Frontend
Run these commands:
```bash=
npm install -g yarn
yarn set version berry
cd app
yarn add bootstrap@4.1.3 react-cookie@3.0.4 react-router-dom@4.3.1 reactstrap@6.5.0
```
## How to run an app

### Backend
Run `com.gchelper.GcHelperApplication`
### Frontend
Run `yarn build start`

## Instruction for users

## Documantation for programmers


**Technologies:**
- Java
- Spring (Core, MVC)
- Spring Boot
- Maven
- JavaScript
- React
- HTML
- CSS

## Application extension prospects

### For users
#### New features
1. Checker
2. Add Geocoins collector
3. Change selected caches to premium member
