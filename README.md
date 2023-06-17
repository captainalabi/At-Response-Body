@ResponseBody enables you to be able to return
 * an object's properties in a json body (complete http response)
 * If you mark the controller class with @Controller, 
 * you will need to mark the method with @ResponseBody
 * but @RestController already encompasses @ResponseBody. 
 * In situations where you have many rest API in a controller class,
 * Just use @RestController at the class level instead of adding @ResponseBody
 * on each method 
