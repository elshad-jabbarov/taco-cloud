//package Springinaction.tacocloud.controller;
//
//import Springinaction.tacocloud.domain.Order;
//import Springinaction.tacocloud.domain.Taco;
//import Springinaction.tacocloud.repo.OrderRepository;
//import Springinaction.tacocloud.repo.TacoRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Sort;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Optional;
//
///**
// * @author Elshad Jabbarov
// * 1/7/2022
// */
//
//@RestController
//@RequestMapping(value = "/design",produces = "application/json")
//@RequiredArgsConstructor
//@CrossOrigin(origins="*")
//public class DesignTacoControllerApi {
//
//    private final TacoRepository tacoRepo;
//    private final OrderRepository repo;
//    @GetMapping("/recent")
//    public Iterable<Taco> recentTacos() {                 //<3>
//        PageRequest page = PageRequest.of(
//                0, 12, Sort.by("createdAt").descending());
//        return tacoRepo.findAll(page).getContent();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Taco> tacoById(@PathVariable("id") Long id) {
//        Optional<Taco> optTaco = tacoRepo.findById(id);
//        return optTaco.map(taco -> new ResponseEntity<>(taco, HttpStatus.OK))
//                .orElseGet(() -> new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
//    }
//
//    @PostMapping(consumes="application/json")
//    @ResponseStatus(HttpStatus.CREATED)
//    public Taco postTaco(@RequestBody Taco taco) {
//        return tacoRepo.save(taco);
//    }
//
//    @PatchMapping(path="/{orderId}", consumes="application/json")
//    public Order patchOrder(@PathVariable("orderId") Long orderId,
//                            @RequestBody Order patch) {
//        Order order = repo.findById(orderId).get();
//        if (patch.getCcNumber() != null) {
//            order.setCcNumber(patch.getCcNumber());
//        }
//        if (patch.getCcExpiration() != null) {
//            order.setCcExpiration(patch.getCcExpiration());
//        }
//        if (patch.getCcCVV() != null) {
//            order.setCcCVV(patch.getCcCVV());
//        }
//        return repo.save(order);
//    }
//}
