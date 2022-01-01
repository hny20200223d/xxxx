public class Visitor extends llooBaseVisitor<Void> {
    @Override
    public Void visitCompUnit(llooParser.CompUnitContext ctx) {
        System.out.println(ctx.getText());
        return super.visitCompUnit(ctx);
    }


}




